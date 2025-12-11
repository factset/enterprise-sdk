

# AnnualizedDividendsObject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. |  [optional]
**eventId** | **String** | FactSet identifier that uniquely identifies the Event. |  [optional]
**effectiveDate** | **String** | Effective Date or Ex-Date of Annualized Dividend in YYYY-MM-DD format. |  [optional]
**iadDefTradingAdj** | **Float** | Annualized Dividend value in the trading currency. The value is adjusted for splits |  [optional]
**currency** | **String** | Currency ISO code associated with the annualized dividends. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). |  [optional]
**requestId** | **String** | Identifier that was used for the request. |  [optional]


## Implemented Interfaces

* Serializable


