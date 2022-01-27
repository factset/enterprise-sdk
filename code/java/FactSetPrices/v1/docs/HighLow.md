

# HighLow


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adjDate** | **LocalDate** | Date of last split for which prices have been adjusted. |  [optional]
**date** | **LocalDate** | Specific reference date for the period expressed in YYYY-MM-DD format. |  [optional]
**period** | **String** | The period of measure requested using the period query parameter. |  [optional]
**fsymId** | **String** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. |  [optional]
**priceHigh** | **Double** | High price over the period requested. This can represent the intra-day or closing price depending on the priceType requested. By default the price is as of closing in local trading currency, split adjusted and not spinoff adjusted. |  [optional]
**priceLow** | **Double** | Low price over the period requested. This can represent the intra-day or closing price depending on the priceType requested. By default the price is as of closing in local trading currency, split adjusted and not spinoff adjusted. |  [optional]
**priceHighDate** | **LocalDate** | Date in which the highest price occurred over the requested period  for the given id expressed in YYYY-MM-DD format. |  [optional]
**priceLowDate** | **LocalDate** | Date in which the lowest price occurred over the requested period for the given id expressed in YYYY-MM-DD format. |  [optional]
**requestId** | **String** | Identifier that was used for the request. |  [optional]


## Implemented Interfaces

* Serializable


