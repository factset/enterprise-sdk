# factsetpartnerfunds.Profile

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | The input identifier. | [optional] 
**error** | [**InvalidIdErrorObject**](InvalidIdErrorObject.md) |  | [optional] 
**name** | **String** | The fund security&#39;s name in proper format. | [optional] 
**category** | **String** | Category of the fund. | [optional] 
**company** | **String** | Company name in proper format. | [optional] 
**group** | **String** | Fund group name. | [optional] 
**objective** | **String** | Fund objective. | [optional] 
**strategy** | **String** | Fund strategy. | [optional] 
**benchmarkIndexName** | **String** | Name of the benchmark index. | [optional] 
**managers** | [**[Manager]**](Manager.md) | List of managers managing the fund. | [optional] 
**inceptionDate** | **Date** | Date when the fund was launched. | [optional] 
**loadType** | **String** | Load type of the fund. | [optional] 
**netExpenseRatio** | **Number** | Net expense ratio of the fund as a percentage. | [optional] 
**managementFee** | **Number** | Management fee of the fund as a percentage. | [optional] 
**netAssets** | **Number** | Net assets of the fund in millions. | [optional] 
**currency** | **String** | Currency of the fund. | [optional] 
**address** | [**Address**](Address.md) |  | [optional] 
**rrspInitialInvestment** | **Number** | Initial investment amounts for the RRSP accounts. | [optional] 
**rrspAdditionalInvestment** | **Number** | Additional investment amounts for the RRSP accounts. | [optional] 
**respEligible** | **Boolean** | Indicates whether the fund is eligible for RESP. | [optional] 
**rrspEligible** | **Boolean** | Indicates whether the fund is eligible for RRSP. | [optional] 
**availableInProvinces** | **[String]** | List of provinces where the fund is available. | [optional] 
**minimumInvestment** | **Number** | Minimum investment amounts for the Non-RRSP accounts. | [optional] 
**additionalInvestment** | **Number** | Additional investment amounts for the Non-RRSP accounts. | [optional] 
**nav** | [**Nav**](Nav.md) |  | [optional] 
**dividend** | [**Dividend**](Dividend.md) |  | [optional] 
**returns** | [**Returns**](Returns.md) |  | [optional] 
**asOfDate** | **Date** | Date when fund profile data was reported by vendor. | [optional] 
**fundGrade** | **String** | The fund grade is a rating system for mutual funds based upon risk adjusted performance. Funds are assigned grades from A to E. | [optional] 
**fundSeries** | **String** | Fund series is a letter code associated with a specific fund and its share class | [optional] 
**fundServ** | [**[FundServ]**](FundServ.md) | FundServ data | [optional] 


