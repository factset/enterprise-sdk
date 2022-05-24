

# CompanyEstimatesListByInstrumentDataFiscalYears

The response includes data items from the fiscal year specified as start (inclusive) up to the fiscal year specified as end (inclusive). The attribute `start` must be less than or equal to the attribute `end`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start** | **BigDecimal** | Only include data items for a fiscal year greater than or equal to the one specified. Must be greater than or equal to one year in the past. If omitted, the response includes data from one year in the past up to the year specified as &#x60;end&#x60;. |  [optional]
**end** | **BigDecimal** | Only include data items for a fiscal year earlier than or equal to the one specified. Must be less than or equal to three years in the future. If omitted, the response includes data from the year specified as &#x60;start&#x60; up to three years in the future. |  [optional]


## Implemented Interfaces

* Serializable


