/*
 * FactSet Ownership API
 * FactSet's Fund Ownership API gives access to both **Holdings** and **Holders** data.<p> Factset's Holdings endpoints gives access to all the underlying securities and their position detils held within a given fund. Fund Types supported include Open-End Mutual Funds, Closed-end Mutual Funds, and Exchange Traded Funds. Security Holders information retrieves all \"holder types\" and their positions across institutions, funds, insiders, and stakeholders.</p><p>The FactSet Ownership and Mutual Funds database collects global equity ownership data for approximately 50,000 institutions, 60,000 unique Mutual Fund portfolios, and 400,000 Insider/Stake holders from around 110 countries.  For more details review our [Data Collection](https://my.apps.factset.com/oa/cms/oaAttachment/87e162be-f2d1-4f40-a85b-bfb1b020d270/20079) methodology. </p> 
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetOwnership.auth;

import com.factset.sdk.FactSetOwnership.Pair;
import com.factset.sdk.FactSetOwnership.ApiException;

import java.net.URI;
import java.util.Map;
import java.util.List;

public interface Authentication {
    /**
     * Apply authentication settings to header and query params.
     *
     * @param queryParams List of query parameters
     * @param headerParams Map of header parameters
     * @param cookieParams Map of cookie parameters
     */
    void applyToParams(List<Pair> queryParams, Map<String, String> headerParams, Map<String, String> cookieParams, String payload, String method, URI uri) throws ApiException;

}
