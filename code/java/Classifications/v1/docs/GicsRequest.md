

# GicsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **java.util.List&lt;String&gt;** | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 
**startDate** | **String** | Requested start date expressed in YYYY-MM-DD format. |  [optional]
**endDate** | **String** | Requested end date for Range expressed in YYYY-MM-DD format. |  [optional]
**frequency** | **Frequency** |  |  [optional]
**calendar** | **Calendar** |  |  [optional]


## Implemented Interfaces

* Serializable


