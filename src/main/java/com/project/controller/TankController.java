package com.project.controller;

import com.project.domain.Tank;
import com.project.service.TankService;
import io.micronaut.core.version.annotation.Version;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Header;
import io.micronaut.http.annotation.Post;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Controller("/api/tanks")
@Tag(name = "Tank API")
public class TankController {

    protected final TankService tankService;

    public TankController(TankService tankService) {
        this.tankService = tankService;
    }

    @Operation(summary = "Get all tanks", description = "A friendly greeting is returned")
    @ApiResponse(content = @Content(mediaType = "application/json", schema = @Schema(type = "string")))
    @ApiResponse(responseCode = "400", description = "Invalid Name Supplied")
    @ApiResponse(responseCode = "404", description = "Person not found")
    @Get(value = "/", produces = MediaType.APPLICATION_JSON)
    @Version("v2.1")
    public Iterable<Tank> getTankListV21(@Header("X-API-VERSION") String version) {
        return tankService.getAll();
    }

    @Operation(summary = "Get all tanks", description = "A friendly greeting is returned")
    @ApiResponse(content = @Content(mediaType = "application/json", schema = @Schema(type = "string")))
    @ApiResponse(responseCode = "400", description = "Invalid Name Supplied")
    @ApiResponse(responseCode = "404", description = "Person not found")
    @Get(value = "/", produces = MediaType.APPLICATION_JSON)
    @Version("v2.2")
    public Iterable<Tank> getTankListV22(@Header("X-API-VERSION") String version) {
        return tankService.getAll();
    }

    @Operation(summary = "Get all tanks", description = "A friendly greeting is returned")
    @ApiResponse(content = @Content(mediaType = "application/json", schema = @Schema(type = "string")))
    @Post("/save")
    @Version("v2.2")
    public Tank saveTank(Tank tank, @Header("X-API-VERSION") String version) {
        return tankService.saveTank(tank);
    }

}
