package com.factset.sdk.FactSetESG.auth;

import com.factset.sdk.FactSetESG.ApiException;
import com.factset.sdk.FactSetESG.Pair;
import com.factset.sdk.utils.authentication.OAuth2Client;
import com.factset.sdk.utils.exceptions.AccessTokenException;
import com.factset.sdk.utils.exceptions.SigningJwsException;

import java.net.URI;
import java.util.List;
import java.util.Map;

public class FactSetOAuth2ClientAuth implements Authentication {

    private final OAuth2Client client;

    public FactSetOAuth2ClientAuth(OAuth2Client oauth2Client) {
        this.client = oauth2Client;
    }

    @Override
    public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams,
                              Map<String, String> cookieParams, String payload, String method, URI uri)
            throws ApiException {

        try {
            headerParams.put("Authorization", "Bearer " + client.getAccessToken());
        } catch (SigningJwsException | AccessTokenException e) {
            throw new ApiException(e);
        }
    }
}
