

# InlineResponse20021DataDividend

Dividend information for the next dividend.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isReported** | **Boolean** | States whether the ETP&#39;s next ex-dividend date is posted on the issuer&#39;s website. This data is available for all the regions. |  [optional]
**exDividendDate** | **LocalDate** | The ex-dividend date of the ETP&#39;s next distribution. This data is available for all the regions. |  [optional]
**qualified** | **BigDecimal** | Qualified dividend payment on ex-dividend-date indicates the amount of distribution considered to have a more favorable tax treatment. This data is available for all regions. |  [optional]
**nonQualified** | **BigDecimal** | Non-Qualified dividend payment on ex-dividend-date indicates the amount of distribution that is taxed as ordinary income. This data is available for all regions. |  [optional]
**returnOfCapital** | **BigDecimal** | Return of Capital available on ex-dividend-date. This data is available for all regions. |  [optional]


## Implemented Interfaces

* Serializable


