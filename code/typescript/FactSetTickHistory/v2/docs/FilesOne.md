# factsettickhistory.FilesOne

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileName** | **String** | Name of the file(s) generated for the query requested | [optional] 
**url** | **String** | Download link for the TickHistory minute bars file with requested parameters.  For &lt;b&gt;trades&lt;/b&gt;, the downloaded file contains the following fields: - isoCode - ticker - date - time - tradeOpen - tradeHigh - tradeLow - tradeClose - tradeVolume - securityType - tradeNumber - tradeVWAP  For &lt;b&gt;quotes&lt;/b&gt;, the downloaded file contains the following fields: - ticker - isoCode - date - time - bidOpenPrc - bidClosePrc - bidSumVol - askOpenPrc - askClosePrc - askSumVol - count - medianSpread  This download link will expire after 12 hours.  | [optional] 


