package org.openapitools.api;

import org.openapitools.model.Quotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.net.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-17T15:45:25.845928+02:00[Europe/Berlin]")
@Controller
@RequestMapping("${openapi.quotation.base-path:/v1}")
public class RfqsApiController implements RfqsApi {

    private final NativeWebRequest request;

    @Autowired
    public RfqsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Void> getQuote(Quotation quotation)  {
        System.out.println("quotation = " + quotation);
        try {
            return ResponseEntity.created(new URI("/rfqs/45324")).build();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
