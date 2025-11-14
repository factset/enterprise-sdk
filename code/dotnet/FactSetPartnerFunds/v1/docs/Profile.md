# FactSet.SDK.FactSetPartnerFunds.Model.Profile
Fund profile data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RequestId** | **string** | The input identifier. | [optional] 
**Error** | [**InvalidIdErrorObject**](InvalidIdErrorObject.md) |  | [optional] 
**Name** | **string** | The fund security&#39;s name in proper format. | [optional] 
**Category** | **string** | Category of the fund. | [optional] 
**Company** | **string** | Company name in proper format. | [optional] 
**Group** | **string** | Fund group name. | [optional] 
**Objective** | **string** | Fund objective. | [optional] 
**Strategy** | **string** | Fund strategy. | [optional] 
**BenchmarkIndexName** | **string** | Name of the benchmark index. | [optional] 
**Managers** | [**List&lt;Manager&gt;**](Manager.md) | List of managers managing the fund. | [optional] 
**InceptionDate** | **DateTime?** | Date when the fund was launched. | [optional] 
**LoadType** | **string** | Load type of the fund. | [optional] 
**NetExpenseRatio** | **double?** | Net expense ratio of the fund as a percentage. | [optional] 
**ManagementFee** | **double?** | Management fee of the fund as a percentage. | [optional] 
**NetAssets** | **double?** | Net assets of the fund in millions. | [optional] 
**Currency** | **string** | Currency of the fund. | [optional] 
**Address** | [**Address**](Address.md) |  | [optional] 
**RrspInitialInvestment** | **double?** | Initial investment amounts for the RRSP accounts. | [optional] 
**RrspAdditionalInvestment** | **double?** | Additional investment amounts for the RRSP accounts. | [optional] 
**RespEligible** | **bool** | Indicates whether the fund is eligible for RESP. | [optional] 
**RrspEligible** | **bool** | Indicates whether the fund is eligible for RRSP. | [optional] 
**AvailableInProvinces** | **List&lt;string&gt;** | List of provinces where the fund is available. | [optional] 
**MinimumInvestment** | **double?** | Minimum investment amounts for the Non-RRSP accounts. | [optional] 
**AdditionalInvestment** | **double?** | Additional investment amounts for the Non-RRSP accounts. | [optional] 
**Nav** | [**Nav**](Nav.md) |  | [optional] 
**Dividend** | [**Dividend**](Dividend.md) |  | [optional] 
**Returns** | [**Returns**](Returns.md) |  | [optional] 
**AsOfDate** | **DateTime?** | Date when fund profile data was reported by vendor. | [optional] 
**FundGrade** | **string** | The fund grade is a rating system for mutual funds based upon risk adjusted performance. Funds are assigned grades from A to E. | [optional] 
**FundSeries** | **string** | Fund series is a letter code associated with a specific fund and its share class | [optional] 
**FundServ** | [**List&lt;FundServ&gt;**](FundServ.md) | FundServ data | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

