# Operator

The operator to be used in the filter criteria, where   * **EQ**  = Equals,   * **NE** = Not equals,   * **CT**  = Contains returns values which contain given substring,   * **NOT_CT** = Not Contains - returns values that **do not** contain the given substring,   * **IN** = The \"In\" operator accepts an array of values and returns data that matches any of them,   * **NOT_IN** = The \"NOT_IN\" operator accepts an array of values and returns data that matches none of them,   * **LT** = Less than,   * **LTE** = Less than or equal to,   * **GT**  = Greater than,   * **GTE** = Greater than or equal to.      <br> **Note:** Both the `IN` and `NOT_IN` operators accept multiple values, while all other operators should be used with a single value. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **str** | The operator to be used in the filter criteria, where   * **EQ**  &#x3D; Equals,   * **NE** &#x3D; Not equals,   * **CT**  &#x3D; Contains returns values which contain given substring,   * **NOT_CT** &#x3D; Not Contains - returns values that **do not** contain the given substring,   * **IN** &#x3D; The \&quot;In\&quot; operator accepts an array of values and returns data that matches any of them,   * **NOT_IN** &#x3D; The \&quot;NOT_IN\&quot; operator accepts an array of values and returns data that matches none of them,   * **LT** &#x3D; Less than,   * **LTE** &#x3D; Less than or equal to,   * **GT**  &#x3D; Greater than,   * **GTE** &#x3D; Greater than or equal to.      &lt;br&gt; **Note:** Both the &#x60;IN&#x60; and &#x60;NOT_IN&#x60; operators accept multiple values, while all other operators should be used with a single value.  |  must be one of ["EQ", "NE", "CT", "NOT_CT", "IN", "NOT_IN", "LT", "LTE", "GT", "GTE", ]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


