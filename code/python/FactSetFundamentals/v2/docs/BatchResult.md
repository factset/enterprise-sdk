# BatchResult


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | Identifier that was used for the request. | [optional] 
**fsym_id** | **str, none_type** | FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. | [optional] 
**metric** | **str, none_type** | The requested &#x60;metric&#x60; input, representing the Fundamental Data Item. For a definition of the item please use the /fundamentals/v#/metrics endpoint. | [optional] 
**periodicity** | **str, none_type** | Periodicity or frequency of the fiscal periods, where ANN &#x3D; Annual Original, ANN_R &#x3D; Annual Latest, QTR &#x3D; Quarterly Original, QTR_R &#x3D; Quarterly Latest, SEMI &#x3D; Semi-Annual Original, SEMI_R &#x3D; Semi-Annual Latest, LTM &#x3D; Last Twelve Months Original, LTM_R &#x3D; Last Twelve Months Latest, LTMSG &#x3D; Last Twelve Months Global, [OA17959](https://my.apps.factset.com/oa/pages/17959), LTM_SEMI &#x3D; Last Twelve Months - Semi-Annual Data, LTM_SEMI_R &#x3D; Last Twelve Months - Semi-Annual Latest Data and YTD &#x3D; Year-to-date. Please note that the coverage for SEMI_R and LTM_R may be limited as fewer companies report with these periodicities. | [optional] 
**fiscal_year** | **int, none_type** | Fiscal year of the reported period in YYYY format. | [optional] 
**fiscal_period_length** | **int, none_type** | Length of the fiscal period in days. | [optional] 
**fiscal_end_date** | **date, none_type** | The normalized data the fiscal period ended. | [optional] 
**report_date** | **date, none_type** | The date the reported fiscal period ended. | [optional] 
**eps_report_date** | **date, none_type** | The date the EPS was reported for the requested periodicity. In YYYY-MM-DD format. Unavailable data returned as 0001-01-01. | [optional] 
**update_type** | **str, none_type** | Update Type: Preliminary - The period is updated from a report that usually contains limited or only key information., Final - The period is updated from a report where detailed information is available in financial statements including the notes to the line items. | [optional] 
**currency** | **str, none_type** | Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
**value** | [**SegmentValue**](SegmentValue.md) |  | [optional] 
**date** | **date, none_type** | Date for the period requested expressed in YYYY-MM-DD format | [optional] 
**fiscal_period** | **int, none_type** | Fiscal Period indicator. Returns an integer representing the fiscal period for the requested item and periodicity. QUARTERLY CODE: 1-Fist Quarter; 2-Second Quarter; 3-Third Quarter; 4-Fourth Quarter. SEMI-CODE: 1-First Semi-annual Period; 2-Second Semi-annual Period. | [optional] 
**label** | **str, none_type** | Report labels of the segment type requested. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


