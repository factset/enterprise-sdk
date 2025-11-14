

# Fees

Fees data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**InvalidIdErrorObject**](InvalidIdErrorObject.md) |  |  [optional]
**requestId** | **String** | The input identifier. |  [optional]
**isPreAuthorizedInvestmentPlan** | **Boolean** | Indicator for the pre authorized contribution plan eligibility. |  [optional]
**isSystematicWithdrawlPlan** | **Boolean** | Indicator for the Systematic withdrawn plan eligibility. |  [optional]
**backendFees** | **String** | Lists the values showing how the backend fees apply during the redemption. |  [optional]
**rrspAnnualAdminFee** | **Double** | An annual fee charged to unit holder’s account for the administration of RRSP accounts. |  [optional]
**rrifAnnualAdminFee** | **Double** | An annual fee charged to unit holder’s account for the administration of RRIF accounts. |  [optional]
**switchFees** | **String** | Lists the fees for switching investment among different funds, within the same fund family. |  [optional]
**rrspWithdrawalFee** | **Double** | A fee charged to unit holders who has used automatic withdrawal plan to contribute to their RRSP account |  [optional]
**rrifWithdrawalFee** | **Double** | A fee charged to unit holders who has used automatic withdrawal plan to contribute to their RRIF account. |  [optional]
**trailerFees** | **String** | Lists the maximum trailer fees charged to each load. |  [optional]
**swpMinBalance** | **Double** | Minimum balance and withdrawal amounts for SWP&#39;s. |  [optional]
**load** | **String** | Load type of the fund. |  [optional]
**isNoLoad** | **Boolean** | Indicator for the &#x60;No Load&#x60; fund type. |  [optional]
**maxFrontEndPercent** | **Double** | The Fund purchaser has the option to choose what the maximums are for front end load type. |  [optional]
**maxBackEndPercent** | **Double** | The Fund purchaser has the option to choose what the maximums are for back end load. |  [optional]
**otherFees** | **String** | Lists any other fees associated with Fund. |  [optional]


## Implemented Interfaces

* Serializable


