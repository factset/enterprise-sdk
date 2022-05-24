package com.factset.sdk.IRNMeetings.auth;

import com.factset.sdk.IRNMeetings.ApiException;
import com.factset.sdk.IRNMeetings.Pair;
import com.factset.sdk.utils.authentication.OAuth2Client;
import com.factset.sdk.utils.exceptions.AccessTokenException;
import com.factset.sdk.utils.exceptions.SigningJwsException;

import java.net.URI;
import java.util.List;
import java.util.Map;

public class FactSetOAuth2ClientAuth implements Authentication {
  private OAuth2Client client;

  public FactSetOAuth2ClientAuth() {}

  public FactSetOAuth2ClientAuth(OAuth2Client client) {
    this.client = client;
  }

  public void setClient(OAuth2Client client) {
    this.client = client;
  }

  public OAuth2Client getClient() {
    return client;
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams,
                            Map<String, String> cookieParams, String payload, String method, URI uri)
          throws ApiException {
      if (client == null) {
        return;
      }

      try {
        headerParams.put("Authorization", "Bearer " + client.getAccessToken());
      } catch (SigningJwsException | AccessTokenException e) {
        throw new ApiException(e);
      }
    }
}
