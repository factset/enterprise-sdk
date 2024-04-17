/*
 * FactSet Search Answers API
 * The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: FactSearch.Team@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetSearchAnswers.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetSearchAnswers.models.Table;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetSearchAnswers.JSON;


/**
 * TableTableTemplateDataAllOf
 */
@JsonPropertyOrder({
  TableTableTemplateDataAllOf.JSON_PROPERTY_TABLE1,
  TableTableTemplateDataAllOf.JSON_PROPERTY_TABLE2
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class TableTableTemplateDataAllOf implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TABLE1 = "table1";
  private Table table1;

  public static final String JSON_PROPERTY_TABLE2 = "table2";
  private Table table2;

  public TableTableTemplateDataAllOf() { 
  }

  public TableTableTemplateDataAllOf table1(Table table1) {
    this.table1 = table1;
    return this;
  }

   /**
   * Get table1
   * @return table1
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TABLE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Table getTable1() {
    return table1;
  }


  @JsonProperty(JSON_PROPERTY_TABLE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTable1(Table table1) {
    this.table1 = table1;
  }


  public TableTableTemplateDataAllOf table2(Table table2) {
    this.table2 = table2;
    return this;
  }

   /**
   * Get table2
   * @return table2
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TABLE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Table getTable2() {
    return table2;
  }


  @JsonProperty(JSON_PROPERTY_TABLE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTable2(Table table2) {
    this.table2 = table2;
  }


  /**
   * Return true if this TableTableTemplateData_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableTableTemplateDataAllOf tableTableTemplateDataAllOf = (TableTableTemplateDataAllOf) o;
    return Objects.equals(this.table1, tableTableTemplateDataAllOf.table1) &&
        Objects.equals(this.table2, tableTableTemplateDataAllOf.table2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(table1, table2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableTableTemplateDataAllOf {\n");
    sb.append("    table1: ").append(toIndentedString(table1)).append("\n");
    sb.append("    table2: ").append(toIndentedString(table2)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

