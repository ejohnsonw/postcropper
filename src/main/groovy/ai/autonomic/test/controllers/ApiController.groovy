package ai.autonomic.test.controllers;

import ai.autonomic.test.services.PostCleanupService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

@Controller("/api/")
public class ApiController {
    @Inject
    PostCleanupService cleanupService;

    @Post("/crop/")
    HttpResponse<Map<String,String>> crop(@Body HashMap params){
       String cropped = cleanupService.crop((String) params.get("message"), (Long) params.get("maximumLength"));
       HashMap result = new HashMap();
       result.put("cropped",cropped);
       return HttpResponse.ok(result);
    }
}
