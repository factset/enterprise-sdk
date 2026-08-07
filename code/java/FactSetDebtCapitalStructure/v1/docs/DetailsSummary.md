

# DetailsSummary

Summary Object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Identifier that was used for the request. |  [optional]
**fsymId** | **String** | FactSet Regional Security Identifier representing the specific data series for the requested &#x60;requestId&#x60;. |  [optional]
**reportDate** | **LocalDate** | Returns the issuer&#39;s fiscal report date per the filing for the period and date(s) requested. |  [optional]
**fiscalYear** | **Integer** | Fiscal year of the reported period in YYYY format. |  [optional]
**totalShortTermDebt** | **Float** | Returns the total short term debt for the date(s) requested. |  [optional]
**totalLongTermDebt** | **Float** | Returns the total long term debt for the date(s) requested. |  [optional]
**totalRevolvingCredit** | **Float** | Returns the total revolving credit for the date(s) requested. |  [optional]
**totalTermDebt** | **Float** | Returns the total term debt for the date(s) requested. |  [optional]
**totalBondDebt** | **Float** | Returns the total bond debt for the date(s) requested. |  [optional]
**otherDebt** | **Float** | Returns all other debt associated with an identifier for the date(s) requested. |  [optional]
**netLongTermDebt** | **Float** | Returns the net long term debt for the date(s) requested. |  [optional]
**totalDebt** | **Float** | Returns the total debt for the date(s) requested. |  [optional]
**currency** | **String** | Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). |  [optional]


## Implemented Interfaces

* Serializable


