# FactSet.SDK.FactSetPartnerFunds.Model.Fees
Fees data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Error** | [**InvalidIdErrorObject**](InvalidIdErrorObject.md) |  | [optional] 
**RequestId** | **string** | The input identifier. | [optional] 
**IsPreAuthorizedInvestmentPlan** | **bool** | Indicator for the pre authorized contribution plan eligibility. | [optional] 
**IsSystematicWithdrawlPlan** | **bool** | Indicator for the Systematic withdrawn plan eligibility. | [optional] 
**BackendFees** | **string** | Lists the values showing how the backend fees apply during the redemption. | [optional] 
**RrspAnnualAdminFee** | **double?** | An annual fee charged to unit holder’s account for the administration of RRSP accounts. | [optional] 
**RrifAnnualAdminFee** | **double?** | An annual fee charged to unit holder’s account for the administration of RRIF accounts. | [optional] 
**SwitchFees** | **string** | Lists the fees for switching investment among different funds, within the same fund family. | [optional] 
**RrspWithdrawalFee** | **double?** | A fee charged to unit holders who has used automatic withdrawal plan to contribute to their RRSP account | [optional] 
**RrifWithdrawalFee** | **double?** | A fee charged to unit holders who has used automatic withdrawal plan to contribute to their RRIF account. | [optional] 
**TrailerFees** | **string** | Lists the maximum trailer fees charged to each load. | [optional] 
**SwpMinBalance** | **double?** | Minimum balance and withdrawal amounts for SWP&#39;s. | [optional] 
**Load** | **string** | Load type of the fund. | [optional] 
**IsNoLoad** | **bool** | Indicator for the &#x60;No Load&#x60; fund type. | [optional] 
**MaxFrontEndPercent** | **double?** | The Fund purchaser has the option to choose what the maximums are for front end load type. | [optional] 
**MaxBackEndPercent** | **double?** | The Fund purchaser has the option to choose what the maximums are for back end load. | [optional] 
**OtherFees** | **string** | Lists any other fees associated with Fund. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

