package com.where.are.you.controllers;

import com.where.are.you.entities.StatusInfo;
import com.where.are.you.services.StatusService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("status")
public class StatusController {
    private final StatusService statusService;

    @GetMapping()
    public List<StatusInfo> getStatusInfos(@RequestParam(required = false, defaultValue = "true") Boolean isLast) {
        if (isLast.equals(Boolean.TRUE)) {
            return statusService.getLastStatusInfo();
        }
        return statusService.getAllStatusInfos();
    }

    @PostMapping()
    public StatusInfo saveStatusInfo(@RequestParam String status) {
        return statusService.saveStatusInfo(status);
    }
}
