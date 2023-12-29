package com.mitchmele.mooserver.config;

import com.azure.identity.DefaultAzureCredential;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class TravelBlobClientConfig {

    @Bean
    public BlobServiceClient blobServiceClient() {
        DefaultAzureCredential defaultAzureCredential = new DefaultAzureCredentialBuilder().build();
        return new BlobServiceClientBuilder()
                .endpoint("https://reactblob1.blob.core.windows.net")
                .credential(defaultAzureCredential)
                .buildClient();
    }
}
