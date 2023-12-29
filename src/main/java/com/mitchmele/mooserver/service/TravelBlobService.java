package com.mitchmele.mooserver.service;

import com.azure.core.http.rest.PagedIterable;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.models.BlobContainerItem;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static java.util.Objects.nonNull;

@Slf4j
@Service
@RequiredArgsConstructor
public class TravelBlobService {

    private final BlobServiceClient blobServiceClient;

    public void readBlobs() {
        PagedIterable<BlobContainerItem> containerItems = null;
        try {
            containerItems = blobServiceClient.listBlobContainers();
        } catch (Exception e) {
            log.error("BUSTED");
        }
        if(nonNull(containerItems)) {
            log.info("CONTAINERS: {}", containerItems.stream().count());
        }
    }
}
