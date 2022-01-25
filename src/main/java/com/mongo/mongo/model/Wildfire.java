package com.mongo.mongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Document(collection = "wildfiresv2")
@Data
public class Wildfire {

    @Id
    private String _id;
    private String county;
    private String district;
    private String fire_name;
    private int fire_year;
    private String fuel_descr;
    private String fuel_model;
    private String general_cause;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate report_date;
    private String unit;
    private double total_acres;

    public Wildfire(String county, String district, String fire_name, int fire_year, String fuel_descr, String fuel_model, String general_cause, LocalDate report_date, String unit, double total_acres) {
        this.county = county;
        this.district = district;
        this.fire_name = fire_name;
        this.fire_year = fire_year;
        this.fuel_descr = fuel_descr;
        this.fuel_model = fuel_model;
        this.general_cause = general_cause;
        this.report_date = report_date;
        this.unit = unit;
        this.total_acres = total_acres;
    }
}
