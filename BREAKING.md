# Breaking Changes

## 2024-04-17 Java: Update from Jersey 2.35 to 3.0

* Library Update: The Jersey library version has been updated from 2.35 to 3.0.
* Package Change: All imports that previously used `javax.ws.rs.client` are now updated to use `jakarta.ws.rs.client`.
* Spring Boot / Spring Framework
  * This update makes the Java SDKs compatible with Spring Boot 3 and Spring Framework 6.
  * And **incompatible** with earlier versions (e.g. Spring Boot 2 and Spring Framework 5).

Affected SDKs: All Java SDKs

## 2023-01-25 Dotnet: Handling of schemas with named and additionalProperties

Accessing values of schemas with named properties and `additionalProperties` in the OpenAPI spec changed.

```yaml
# OpenAPI Spec Example
components:
  schemas:
    MySchema:
      type: object
      properties:
        namedProperty:
          # ...
      additionalProperties: true
```

Accessing properties with the old code:

```cs
... = instance.NamedProperty // this was null
... = instance["namedProperty"] // to get the named property
... = instance["AnyOtherAdditionalProperty"] // to get additional properties
```

Accessing properties with the new code:

```cs
... = instance.NamedProperty // to get the named property
... = instance.AdditionalProperties["AnyOtherAddtionalProperty"] // to get additional properties
```

Affected SDKs:
* [FactSetESG v2.0.0](./code/dotnet/FactSetESG/v1)
* [FactSetETF v2.0.0](./code/dotnet/FactSetETF/v1)
* [FactSetPrivateMarkets v2.0.0](./code/dotnet/FactSetPrivateMarkets/v1)
* [FactSetQuantFactorLibrary v2.0.0](./code/dotnet/FactSetQuantFactorLibrary/v1)
* [FactSetRBICS v0.22.0](./code/dotnet/FactSetRBICS/v1)
* [FactSetTermsandConditions v2.0.0](./code/dotnet/FactSetTermsandConditions/v1)
* [Formula v2.0.0](./code/dotnet/Formula/v1)
* [IRNConfiguration v2.0.0](./code/dotnet/IRNConfiguration/v1)
* [IRNContacts v2.0.0](./code/dotnet/IRNContacts/v1)
* [IRNCustomSymbols v2.0.0](./code/dotnet/IRNCustomSymbols/v1)
* [IRNMeetings v2.0.0](./code/dotnet/IRNMeetings/v1)
* [IRNNotes v2.0.0](./code/dotnet/IRNNotes/v1)
* [ModelPortfolio v0.22.0](./code/dotnet/ModelPortfolio/v3)
* [Symbology v3.0.0](./code/dotnet/Symbology/v3)
