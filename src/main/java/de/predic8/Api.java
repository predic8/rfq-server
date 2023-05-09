package de.predic8;

import org.openapitools.api.*;
import org.openapitools.model.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.*;

import javax.annotation.*;
import java.net.*;
import java.util.*;

@Controller
@RequestMapping("${openapi.quotation.base-path:/v1}")
public class Api implements RfqsApi {

    private final NativeWebRequest request;

    @Autowired
    public Api(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Void> creatQuote(Quotation quotation) {
        quotation.setId(UUID.randomUUID());
        System.out.println("quotation = " + quotation);
        return ResponseEntity.ok().build();
    }
}
