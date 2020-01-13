package com.fetchrewards.emailchecker.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.fetchrewards.emailchecker.bean.DataStruct;

@Service
public class EmailCheckService {
	
	public int uniqueEmails(DataStruct structure) {
		
		String[] emails = structure.getValues();
		
		Set<String> uniqueEntries = new HashSet<>();
		StringBuilder validEmail;

		for (String email : emails) {
			validEmail = new StringBuilder();
			for (int i = 0; i < email.length(); i++) {
				char c = email.charAt(i);
				if (c == '.')
					continue;
				else if (c == '+' || c == '@') {
					while (email.charAt(i) != '@') {
						i++;
					}
					validEmail.append(email.substring(i));
					break;
				} else {
					validEmail.append(c);
				}
			}
			uniqueEntries.add(validEmail.toString());
		}
		return uniqueEntries.size();
	}

}
