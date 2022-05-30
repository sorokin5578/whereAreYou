package com.where.are.you.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

import java.util.Date;

@Getter
public class StatusInfo {
    private final String status;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private final Date date;

    public StatusInfo(String status) {
        this.status = status;
        this.date = new Date();
    }
}
