# Profile

Fund profile data

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | The input identifier. | [optional] 
**error** | [**InvalidIdErrorObject**](InvalidIdErrorObject.md) |  | [optional] 
**name** | **str** | The fund security&#39;s name in proper format. | [optional] 
**category** | **str** | Category of the fund. | [optional] 
**company** | **str** | Company name in proper format. | [optional] 
**group** | **str** | Fund group name. | [optional] 
**objective** | **str** | Fund objective. | [optional] 
**strategy** | **str** | Fund strategy. | [optional] 
**benchmark_index_name** | **str** | Name of the benchmark index. | [optional] 
**managers** | [**[Manager]**](Manager.md) | List of managers managing the fund. | [optional] 
**inception_date** | **date, none_type** | Date when the fund was launched. | [optional] 
**load_type** | **str** | Load type of the fund. | [optional] 
**net_expense_ratio** | **float, none_type** | Net expense ratio of the fund as a percentage. | [optional] 
**management_fee** | **float, none_type** | Management fee of the fund as a percentage. | [optional] 
**net_assets** | **float, none_type** | Net assets of the fund in millions. | [optional] 
**currency** | **str** | Currency of the fund. | [optional] 
**address** | [**Address**](Address.md) |  | [optional] 
**rrsp_initial_investment** | **float, none_type** | Initial investment amounts for the RRSP accounts. | [optional] 
**rrsp_additional_investment** | **float, none_type** | Additional investment amounts for the RRSP accounts. | [optional] 
**resp_eligible** | **bool** | Indicates whether the fund is eligible for RESP. | [optional] 
**rrsp_eligible** | **bool** | Indicates whether the fund is eligible for RRSP. | [optional] 
**available_in_provinces** | **[str]** | List of provinces where the fund is available. | [optional] 
**minimum_investment** | **float, none_type** | Minimum investment amounts for the Non-RRSP accounts. | [optional] 
**additional_investment** | **float, none_type** | Additional investment amounts for the Non-RRSP accounts. | [optional] 
**nav** | [**Nav**](Nav.md) |  | [optional] 
**dividend** | [**Dividend**](Dividend.md) |  | [optional] 
**returns** | [**Returns**](Returns.md) |  | [optional] 
**as_of_date** | **date, none_type** | Date when fund profile data was reported by vendor. | [optional] 
**fund_grade** | **str** | The fund grade is a rating system for mutual funds based upon risk adjusted performance. Funds are assigned grades from A to E. | [optional] 
**fund_series** | **str** | Fund series is a letter code associated with a specific fund and its share class | [optional] 
**fund_serv** | [**[FundServ]**](FundServ.md) | FundServ data | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


