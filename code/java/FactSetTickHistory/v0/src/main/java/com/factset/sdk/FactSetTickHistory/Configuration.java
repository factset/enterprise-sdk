/*
 * Tick History Level 2 (Beta)
 * Tick History **Level 2** provides dynamic access to the historical tick data up to 10 levels of depth for a specific security for specific dates or date range. The API generates output files with data based on client-specified input parameters. The input parameters include universe specification and date ranges for which the data will be generated. When the API request with specified input parameters has been completed, the output files will be made available back to the users through a secure URL to the location where the files are stored. Therefore, this API has two APIs (i) Request files API (ii) Get Files API.
 *
 * The version of the OpenAPI document: 0.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetTickHistory;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Configuration {
    private static ApiClient defaultApiClient = new ApiClient();

    /**
     * Get the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @return Default API client
     */
    public static ApiClient getDefaultApiClient() {
        return defaultApiClient;
    }

    /**
     * Set the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @param apiClient API client
     */
    public static void setDefaultApiClient(ApiClient apiClient) {
        defaultApiClient = apiClient;
    }
}
