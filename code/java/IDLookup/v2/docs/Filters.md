

# Filters

  Filters object helps narrow down the search results by including and/or excluding parameters. Filters are specific, depending on the dataset.   Please refer to `/metadata/fields/list-by-dataset` for the complete list of supported fields and values to filter the requested dataset.  If no filters are provided, all data will be returned.    * include - restricts results to those matching the provided fields and values   * exclude - returns all results except those matching the provided fields and values.   Possible cases:    * No filters object (default): No filter will be applied to the results.     * Include and exclude objects used together: Results are based on the combination of different fields used in both objects.     * The same field cannot be used in both include and exclude. If that happens, an HTTP 400 response is returned.    * If a specified field does not exist in the dataset, an HTTP 400 response is returned. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**include** | **Map&lt;String, java.util.List&lt;String&gt;&gt;** |  |  [optional]
**exclude** | **Map&lt;String, java.util.List&lt;String&gt;&gt;** |  |  [optional]


## Implemented Interfaces

* Serializable


