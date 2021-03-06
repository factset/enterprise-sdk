

# InlineResponse20024Data


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**symbol** | **String** | Identifier of the holding. (when available). |  [optional]
**name** | **String** | Name of the holding. |  [optional]
**securityType** | **String** | Financial instrument type of the holding. |  [optional]
**exchange** | [**InlineResponse20024Exchange**](InlineResponse20024Exchange.md) |  |  [optional]
**reportDate** | **LocalDate** | Reporting date of the holding. |  [optional]
**shares** | **BigDecimal** | Number of shares held, unadjusted for corporate actions. |  [optional]
**marketValue** | **BigDecimal** | Market value of the holding, unadjusted for corporate actions. |  [optional]
**currencyCode** | **String** | Code representing the currency of the holding and  it&#39;s in format ISO 4217 |  [optional]
**weight** | **BigDecimal** | Weight of the holding within the ETP. |  [optional]


## Implemented Interfaces

* Serializable


