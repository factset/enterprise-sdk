/*
 * S&P Global Fixed Income Evaluated Prices & Analytics API
 * Gain access to evaluated pricing and analytics data for Corporate Bonds, Municipal Bonds and Asset Backed Securities provided by S&P Global (formerly IHS Markit) .  Data returned through multiple endpoints like prices, spread, yield, yield curve, sensitivity, coupon information, securities metadata and details specific to the Asset Backed Securities. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.factset.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * Class that add parsing/formatting support for Java 8+ {@code OffsetDateTime} class.
 * It's generated for java clients when {@code AbstractJavaCodegen#dateLibrary} specified as {@code java8}.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class JavaTimeFormatter {

    private DateTimeFormatter offsetDateTimeFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

    /**
     * Get the date format used to parse/format {@code OffsetDateTime} parameters.
     * @return DateTimeFormatter
     */
    public DateTimeFormatter getOffsetDateTimeFormatter() {
        return offsetDateTimeFormatter;
    }

    /**
     * Set the date format used to parse/format {@code OffsetDateTime} parameters.
     * @param offsetDateTimeFormatter {@code DateTimeFormatter}
     */
    public void setOffsetDateTimeFormatter(DateTimeFormatter offsetDateTimeFormatter) {
        this.offsetDateTimeFormatter = offsetDateTimeFormatter;
    }

    /**
     * Parse the given string into {@code OffsetDateTime} object.
     * @param str String
     * @return {@code OffsetDateTime}
     */
    public OffsetDateTime parseOffsetDateTime(String str) {
        try {
            return OffsetDateTime.parse(str, offsetDateTimeFormatter);
        } catch (DateTimeParseException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * Format the given {@code OffsetDateTime} object into string.
     * @param offsetDateTime {@code OffsetDateTime}
     * @return {@code OffsetDateTime} in string format
     */
    public String formatOffsetDateTime(OffsetDateTime offsetDateTime) {
        return offsetDateTimeFormatter.format(offsetDateTime);
    }
}
