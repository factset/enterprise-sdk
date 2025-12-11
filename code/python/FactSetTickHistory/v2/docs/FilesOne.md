# FilesOne

Array of data objects

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_name** | **str** | Name of the file(s) generated for the query requested | [optional] 
**url** | **str** | Download link for the TickHistory minute bars file with requested parameters.  For &lt;b&gt;trades&lt;/b&gt;, the downloaded file contains the following fields: - isoCode - ticker - date - time - tradeOpen - tradeHigh - tradeLow - tradeClose - tradeVolume - securityType - tradeNumber - tradeVWAP - dateUtc - timeUtc  For &lt;b&gt;quotes&lt;/b&gt;, the downloaded file contains the following fields: - ticker - isoCode - date - time - bidOpenPrc - bidClosePrc - bidSumVol - askOpenPrc - askClosePrc - askSumVol - count - medianSpread - dateUtc - timeUtc  This download link will expire after 12 hours.  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


