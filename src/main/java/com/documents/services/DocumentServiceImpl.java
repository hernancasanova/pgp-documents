package com.documents.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import com.documents.Document;
//import com.documents.PgpApplication;
//import com.pgp.controllers.DocumentController.Documento;
import com.documents.dao.DocumentDao;
//import com.documents.dto.DocumentDto;
import com.documents.models.Document;
/*import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.http.FileContent;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.drive.Drive;
import com.google.api.services.drive.DriveScopes;
import com.google.api.services.drive.model.File;
import com.google.auth.http.HttpCredentialsAdapter;
import com.google.auth.oauth2.GoogleCredentials;*/

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collections;

@Service
public class DocumentServiceImpl implements IDocumentService{
	
	
	@Autowired
	private DocumentDao documentDao;
	
	@Transactional(readOnly=true)
	public List<Document> findAll() {
		return (List<Document>)documentDao.findAll();
	}
	
	/*@Transactional(readOnly=true)
	public List<DocumentDto> getAll() {
		return (List<DocumentDto>)documentDao.getAll();
	}

	@Override
	public void register(Document document, Path path, String filename) {
		// TODO Auto-generated method stub
		try {
			//String name=document.name;
			uploadBasic(path,filename);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (GeneralSecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		documentDao.save(document);
		
	}*/
}
