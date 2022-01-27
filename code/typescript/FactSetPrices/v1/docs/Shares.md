# factsetprices.Shares

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**date** | **Date** | Date expressed in YYYY-MM-DD format. | [optional] 
**adjDate** | **Date** | Date of last split for which return has been adjusted. Use the /factset-prices/v#/splits endpoint for details on split. If not available, date will return as 0001-01-01. | [optional] 
**sharesSecurity** | **Number** | **Security-level** Common Shares Outstanding in base units. Shares sourced primarily from SEC filings. Securities in certain countries will include treasury shares. For details visit [Online Assistant Page #10435](https://oa.apps.factset.com/pages/10435) | [optional] 
**sharesCompany** | **Number** | **Company-level** Shares Outstanding aggregated across all share classes. Non-traded shares are *excluded*. In base units. For more details, visit [Online Assistant Page #16867](https://oa.apps.factset.com/pages/16867) | [optional] 
**sharesCompanyNontraded** | **Number** | **Company-level** Shares Outstanding aggregated across all share classes. Non-traded shares are *included* to the calculation basis by the proportion of their nominal or par value. In base units. For more details, visit [Online Assistant Page #16867](https://oa.apps.factset.com/pages/16867) | [optional] 
**requestId** | **String** | Identifier that was used for the request. | [optional] 


