package com.where.are.you.services;

import com.where.are.you.entities.StatusInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class StatusService {
    private final List<StatusInfo> statusInfos = new ArrayList<>();

    public List<StatusInfo> getAllStatusInfos() {
        return statusInfos;
    }

    public List<StatusInfo> getLastStatusInfo() {
        if (statusInfos.isEmpty()) {
            return Collections.emptyList();
        }
        return Collections.singletonList(statusInfos.get(statusInfos.size() - 1));
    }

    public StatusInfo saveStatusInfo(String status) {
        StatusInfo statusInfo = new StatusInfo(status);
        statusInfos.add(statusInfo);
        return statusInfo;
    }
}
