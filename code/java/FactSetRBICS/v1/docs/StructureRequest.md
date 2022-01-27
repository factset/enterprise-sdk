

# StructureRequest

Structure Request Body

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rbicsIds** | **java.util.List&lt;String&gt;** | RBICS Taxonomy Id Filter. Use to lookup the structure details for the Id requested.  |  [optional]
**level** | **Integer** | RBICS industry levels to include in the response. All levels from 1-N will be returned. For example, &#39;3&#39; returns all levels 1,2 and 3. To request all levels, request level&#x3D;6. Level 1 is returned by default.   |Level|Description|Number of Groups|   |---|---|---|   |1|Economomy|14|   |2|Sector|37   |3|Sub-Sector|109|   |4|Industry Group|366|   |5|Inudstry|901|   |6|Sub-Industry|1629|  |  [optional]
**includeNames** | **Boolean** | Option to include or exclude industry Names and the L6 Description. True &#x3D; Include Names; False &#x3D; Exclude Names.  |  [optional]
**date** | **String** | Effective date for data expressed in YYYY-MM-DD format. If no date is requested, the default behavior is to return the full history for the requested entity.  |  [optional]


## Implemented Interfaces

* Serializable


