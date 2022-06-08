package br.com.republica.security;

import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class TokenAuthenticationService {
	
	
	        // Tempo de Expiração = 10 dias
			static final long EXPIRATION_TIME = 860_000_000;
			static final String SECRET = "Republica";
			static final String TOKEN_PREFIX = "Bearer ";
			static final String HEADER_STRING = "Authorization";
			
			static void addAuthentication(HttpServletResponse response, String username) {
				
				Map<String, String> responseMap = new HashMap<String, String>();
				    
				String JWT = Jwts.builder()
						.setSubject(username)
						.setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
						.signWith(SignatureAlgorithm.HS512, SECRET)
						.compact();
				
				response.setHeader(HEADER_STRING ,TOKEN_PREFIX + "" + JWT); 
				responseMap.put("Authentication", TOKEN_PREFIX +""+ JWT	);
				
				try {
					String json = new ObjectMapper().writeValueAsString(responseMap);
					response.getWriter().write(json);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					responseMap.put("Authentication", "Erro de usuário ou senha");
				}
				
				
			}
			
			static Authentication getAuthentication(HttpServletRequest request) {
				String token = request.getHeader(HEADER_STRING);
				
				if (token != null) {
					// faz parse do token
					String user = Jwts.parser()
							.setSigningKey(SECRET)
							.parseClaimsJws(token.replace(TOKEN_PREFIX, ""))
							.getBody()
							.getSubject();
							
					
					if (user != null) {
						return new UsernamePasswordAuthenticationToken(user, null, Collections.emptyList());
					}
				}
				return null;
			}
			
}


