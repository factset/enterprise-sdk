/*
 * Conversational API Powered by FactSet Mercury
 * ### OVERVIEW  The FactSet Conversational API allows clients to white-label core FactSet Mercury capabilities in a client’s chatbot experience.  Request data from FactSet using natural language queries. Start the response generation using the `/query` endpoint, poll the status using `/status`. Once the result is ready, retrieve it using `/result`.  If your response contains a file ID, such as for an Excel chart or a FactSet ActiveGraph, retrieve it using the file ID at the `/download/file` endpoint.  We also encourage you to provide feedback on your responses using the `/feedback` endpoint!  **Please note:** \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable.  **Try the Conversational API and view Available Content**  In the [Using the Conversational API Online Assistant](https://my.apps.factset.com/oa/pages/23209) you can find instructions on how to start using the Conversational API, and the full list of content available.  Some of the prompts supported are:  - What is Tesla's enterprise value? - Create a chart showing CME price relative to the S&P 500 - What were the highlights from Palantir's recent earnings call?  **Adaptive Card Format**  The Conversational API uses the Microsoft Adaptive Card format for response data surfaced from FactSet content sets. `Value` property of parent FederationData contains a JSON serialized presentation of a Microsoft Adaptive Card. See [Microsoft docs](https://learn.microsoft.com/en-us/adaptive-cards/) for Adaptive Card documentation, and the [Adaptive Card schema explorer](https://adaptivecards.io/explorer/) for schema details. **Please note**: \"The adaptive card may contain actions, which represent functionality within the card itself. In order to execute these actions, a handler must be implemented in your Adaptive Card rendering process. See [handling actions](https://learn.microsoft.com/en-us/adaptive-cards/sdk/rendering-cards/javascript/actions) for an example implementation.  **STACH Format**  The Conversational API may use Factset's STACH V3 format to represent tabular data in JSON. Please refer to the [STACH V3 documentation](https://factset.github.io/stachschema/#/v3/README) on column organized data for more information on how to process STACH-organized data. <details>   <summary><u>**STACH Example**</u></summary>   ```json   {     \"version\": \"3.1\",     \"table\": {       \"primaryKeys\": [         \"Insider Holders\",         \"MV (M,$)\",         \"% O/S\"       ],       \"totalNumRows\": 5     },     \"views\": [       {         \"name\": \"view\",         \"displayName\": \"who are the suppliers of nike\",         \"table\": {           \"columns\": [             \"Insider Holders\",             \"MV (M,$)\",             \"% O/S\"           ],           \"headers\": {             \"Insider Holders\": \"Insider Holders\",             \"MV (M,$)\": \"MV (M,$)\",             \"% O/S\": \"% O/S\"           }         }       }     ],     \"columns\": [       {         \"name\": \"Insider Holders\",         \"contextualType\": \"string\",         \"customMetadata\": {           \"relevancy\": {             \"contextualType\": \"int32\",             \"value\": 100           }         }       },       {         \"name\": \"MV (M,$)\",         \"contextualType\": \"real\",         \"customMetadata\": {           \"relevancy\": {             \"contextualType\": \"int32\",             \"value\": 67           }         }       },       {         \"name\": \"% O/S\",         \"contextualType\": \"real\",         \"customMetadata\": {           \"relevancy\": {             \"contextualType\": \"int32\",             \"value\": 34           }         }       }     ],     \"rows\": [       {         \"Insider Holders\": \"Knight Philip Hampson\",         \"MV (M,$)\": 3156.8,         \"% O/S\": 1.531       },       {         \"Insider Holders\": \"Knight Travis A\",         \"MV (M,$)\": 601.6,         \"% O/S\": 0.496       },       {         \"Insider Holders\": \"Wellcome Trust Ltd. (Direct Investments)\",         \"MV (M,$)\": 225.5,         \"% O/S\": 0.105       },       {         \"Insider Holders\": \"Parker Mark G\",         \"MV (M,$)\": 100.1,         \"% O/S\": 0.056       },       {         \"Insider Holders\": \"Donahoe John J Ii\",         \"MV (M,$)\": 19.8,         \"% O/S\": 0.018       }     ]   }   ``` </details>  **Citations**  Responses from the Conversational API may contain `citations` which provide references to the source of the data directly within the textual response. Phrases within the response text are mapped to a data item in the `citations` object via a bracketed ID (e.g. `[1]`). Citations may be used to provide additional context or to verify the source of the data; in some cases, a single phrase within the response may be supported by multiple data sources. **Please note**: Links to the source data are provided as links to FactSet's Document Viewer (see [Document Viewer OA page](https://my.apps.factset.com/oa/pages/17390)). The link will direct you to the entire document; you may need to search for the specific phrase within the document. We are currently working on providing direct links to the specific section or excerpt of the document. <details>   <summary><u>**Citation Example**</u></summary>   ```json   {     \"type\": \"string\",     \"value\": \"FactSet has expressed optimism about the potential of generative AI (GenAI) to enhance their product offerings and drive efficiency[1].\"     \"citations\": {       \"[1]\": [         \"phraseId\": \"aba1d533-08b3-4d3e-8961-5d37bb2caff6\",         \"content\": \"At the same time, expectations are high around the effect generative AI will have on our industry.\",         \"speakerInfo\": {           \"companyId\": \"0016YD-E\",           \"companyName\": \"FactSet Research Systems, Inc.\",           \"speakerId\": \"0DPHLH-E\",           \"speakerName\": \"Philip Snow\",           \"speakerTitle\": \"Chief Executive Officer & Director\"         },         \"sourceURL\": \"https://my.apps.factset.com/viewer-fusion/?_doc_id=2948302-t&_doc_date=20231219&_doc_product=FCST&_doc_docfn=/home/docs/fcst/8/302/2948302-t.pdf&e=false\"       ]     }   }   ``` </details> 
 *
 * The version of the OpenAPI document: 0.6.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.auth;

import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.Pair;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.ApiException;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.builder.api.DefaultApi20;
import com.github.scribejava.core.exceptions.OAuthException;
import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.oauth.OAuth20Service;

import jakarta.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class OAuth implements Authentication {
    private static final Logger log = Logger.getLogger(OAuth.class.getName());

    private String tokenUrl;
    private String absoluteTokenUrl;
    private OAuthFlow flow = OAuthFlow.application;
    private OAuth20Service service;
    private DefaultApi20 authApi;
    private String scope;
    private String username;
    private String password;
    private String code;
    private volatile OAuth2AccessToken accessToken;

    public OAuth(String basePath, String tokenUrl) {
        this.tokenUrl = tokenUrl;
        this.absoluteTokenUrl = createAbsoluteTokenUrl(basePath, tokenUrl);
        authApi = new DefaultApi20() {
            @Override
            public String getAccessTokenEndpoint() {
              return absoluteTokenUrl;
            }

            @Override
            protected String getAuthorizationBaseUrl() {
              throw new UnsupportedOperationException("Shouldn't get there !");
            }
        };
    }

    private static String createAbsoluteTokenUrl(String basePath, String tokenUrl) {
        if (!URI.create(tokenUrl).isAbsolute()) {
            try {
                return UriBuilder.fromPath(basePath).path(tokenUrl).build().toURL().toString();
            } catch (MalformedURLException e) {
                log.log(Level.SEVERE, "Couldn't create absolute token URL", e);
            }
        }
        return tokenUrl;
    }

    @Override
    public void applyToParams(
        List<Pair> queryParams,
        Map<String, String> headerParams,
        Map<String, String> cookieParams,
        String payload,
        String method,
        URI uri)
        throws ApiException {

        if (accessToken == null) {
            obtainAccessToken(null);
        }
        if (accessToken != null) {
            headerParams.put("Authorization", "Bearer " + accessToken.getAccessToken());
        }
    }

    public OAuth2AccessToken renewAccessToken() throws ApiException {
        String refreshToken = null;
        if (accessToken != null) {
            refreshToken = accessToken.getRefreshToken();
            accessToken = null;
        }
        return obtainAccessToken(refreshToken);
    }

    public synchronized OAuth2AccessToken obtainAccessToken(String refreshToken) throws ApiException {
        if (service == null) {
            log.log(Level.FINE, "service is null in obtainAccessToken.");
            return null;
        }
        try {
            if (refreshToken != null) {
                return service.refreshAccessToken(refreshToken);
            }
        } catch (OAuthException | InterruptedException | ExecutionException | IOException e) {
            log.log(Level.FINE, "Refreshing the access token using the refresh token failed", e);
        }
        try {
            switch (flow) {
                case password:
                    if (username != null && password != null) {
                        accessToken = service.getAccessTokenPasswordGrant(username, password, scope);
                    }
                    break;
                case accessCode:
                    if (code != null) {
                        accessToken = service.getAccessToken(code);
                        code = null;
                    }
                    break;
                case application:
                    accessToken = service.getAccessTokenClientCredentialsGrant(scope);
                    break;
                default:
                    log.log(Level.SEVERE, "Invalid flow in obtainAccessToken: " + flow);
            }
        } catch (OAuthException | InterruptedException | ExecutionException | IOException e) {
            throw new ApiException(e);
        }
        return accessToken;
    }

    public OAuth2AccessToken getAccessToken() {
        return accessToken;
    }

    public OAuth setAccessToken(OAuth2AccessToken accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    public OAuth setAccessToken(String accessToken) {
        this.accessToken = new OAuth2AccessToken(accessToken);
        return this;
    }

    public OAuth setScope(String scope) {
       this.scope = scope;
       return this;
    }

    public OAuth setCredentials(String clientId, String clientSecret, Boolean debug) {
        if (Boolean.TRUE.equals(debug)) {
            service = new ServiceBuilder(clientId)
                .apiSecret(clientSecret).debug()
                .build(authApi);
        } else {
            service = new ServiceBuilder(clientId)
                .apiSecret(clientSecret)
                .build(authApi);
        }
        return this;
    }

    public OAuth usePasswordFlow(String username, String password) {
        this.flow = OAuthFlow.password;
        this.username = username;
        this.password = password;
        return this;
    }

    public OAuth useAuthorizationCodeFlow(String code) {
        this.flow = OAuthFlow.accessCode;
        this.code = code;
        return this;
    }

    public OAuth setFlow(OAuthFlow flow) {
        this.flow = flow;
        return this;
    }

    public void setBasePath(String basePath) {
        this.absoluteTokenUrl = createAbsoluteTokenUrl(basePath, tokenUrl);
    }
}