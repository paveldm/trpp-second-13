package ru.mirea.trpp_second_13.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.opencsv.bean.CsvBindByName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/** Сущность автомобиля. */
@Getter
@Setter
@ToString
public class Car {

    /** Идентификатор. */
    @JsonProperty("id")
    @CsvBindByName(column = "id")
    private Long id;
    /** Производитель. */
    @JsonProperty("vendor")
    @CsvBindByName(column = "vendor")
    private String vendor;
    /** Модель. */
    @JsonProperty("model")
    @CsvBindByName(column = "model")
    private String model;
    /** Модельный год. */
    @JsonProperty("modelYear")
    @CsvBindByName(column = "model_year")
    private String modelYear;
    /** VIN номер. */
    @JsonProperty("vin")
    @CsvBindByName(column = "vin")
    private String vin;

}
