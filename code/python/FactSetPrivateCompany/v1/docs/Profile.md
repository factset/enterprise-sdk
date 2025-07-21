# Profile

Profile object

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | Identifier that was used for the request | [optional] 
**currency** | **str, none_type** | Code representing the currency | [optional] 
**ceo** | **str, none_type** | Currently listed company CEO | [optional] 
**founders** | **[str, none_type]** | Currently listed company founders | [optional] 
**chair** | **str, none_type** | Current chairperson | [optional] 
**pe_backing_current** | **bool, none_type** | Flag for whether the specified company currently has PE backing | [optional] 
**pe_backing_ever** | **bool, none_type** | Flag for whether the specified company has ever had PE backing | [optional] 
**vc_backing_current** | **bool, none_type** | Flag for whether the specified company currently has VC backing | [optional] 
**vc_backing_ever** | **bool, none_type** | Flag for whether the specified company has ever had VC backing | [optional] 
**total_investors** | **int, none_type** | Total number of investment rounds for the portfolio company | [optional] 
**active_investors** | **int, none_type** | Number of active portfolio companies for the specified private equity firm | [optional] 
**active_investors_list** | **[str, none_type]** | List of investors that are active investors in the given portfolio company itemized by security | [optional] 
**exited_investors_list** | **[str, none_type]** | List of investors that had previously invested in the given portfolio company itemized by security | [optional] 
**amount_raised_usd** | **float, none_type** | Current estimated total of venture capital raised in USD.  Each investment amount is currency converted on the day of the investment. Then all values are summed.   | [optional] 
**amount_raised_local_currency** | **float, none_type** | Current estimated total of venture capital raised in local currency. | [optional] 
**vcpe_amount_raised_usd** | **float, none_type** | Current estimated total of venture capital and private equity raised in USD.  Each investment amount is currency converted on the day of the investment. Then all values are summed.  | [optional] 
**vcpe_amount_raised_local_currency** | **float, none_type** | Current estimated total of venture capital raised in all rounds of the portfolio company. This item applies to venture capital raised rounds only.    | [optional] 
**investment_stats** | **float, none_type** | Investment stats summary for the specified portfolio company. Always represented in USD.   | [optional] 
**last_investment_date** | **date, none_type** | The date that is associated with the most recent amount of money that was invested into the portfolio company | [optional] 
**first_investment_date** | **date, none_type** | The date that is associated with the amount of money that was first invested into the portfolio company. | [optional] 
**business_tags** | **[str, none_type]** | Tag(s) that describe what the company does based on the most common language (text snippets)  found on their website and/or social media sites.  | [optional] 
**latest_post_money_valuation** | **float, none_type** | The value of a company, post capital injection. This is the latest value and may not include  the most recent rounds of funding. Always represented in USD  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


