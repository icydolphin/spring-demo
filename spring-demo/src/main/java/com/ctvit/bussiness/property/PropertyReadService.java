package com.ctvit.bussiness.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyReadService {
	@Autowired
	AuthorSettings authorSettings;

	public AuthorSettings getAuthorSettings() {
		return authorSettings;
	}
	
}
