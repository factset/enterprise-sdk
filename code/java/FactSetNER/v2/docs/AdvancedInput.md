

# AdvancedInput

Input configuration for Advanced endpoint single-text processing with financial entity support.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**input** | **String** | Text to be processed for entity extraction. Supports single-input processing. | 
**entities** | **java.util.List&lt;AdvancedEntityType&gt;** | Array of entity types to extract from the input text. If &#x60;product&#x60; is included, &#x60;organization&#x60; must also be included.  | Entity Type | Description | |---|---| | person | Individual names and references to people | | organization | Company names, institutions, and organizational entities | | location | Geographic locations including cities, countries, regions | | product | Commercial products and services | | datetime | Specific dates, times, and temporal expressions | | period | Time periods and durations | | numerical | Numbers, quantities, and numerical expressions | | cryptocurrency | Cryptocurrency names and symbols (e.g., Bitcoin, ETH) | | index | Financial indices and benchmarks (e.g., S&amp;P 500, NASDAQ) | | rate | Interest rates and financial rates | | yield | Bond yields and other financial yields | | commodity | Commodities and raw materials | | currency | Currency codes and currency references | | future | Financial futures contracts | | fund | Investment funds and mutual funds | | asset | Financial assets and asset classes | | debtinstrument | Bonds, notes, and other debt instruments |  | 
**includeOffsets** | **Boolean** | If true, include character offset positions (startChar and endChar) for each extracted entity in the response. |  [optional]
**performLookup** | **Boolean** | If true, perform entity lookup to resolve extracted entities to FactSet entity identifiers and metadata. |  [optional]
**model** | [**ModelEnum**](#ModelEnum) | The model to use for entity extraction, by name (not the underlying gateway ID). Optional — defaults to Llama 4 Scout Instruct if not provided. |  [optional]



## Enum: ModelEnum

Name | Value
---- | -----
GPT_5_2 | &quot;GPT 5.2&quot;
CLAUDE_SONNET_4_6 | &quot;Claude Sonnet 4.6&quot;
LLAMA_4_SCOUT_INSTRUCT | &quot;Llama 4 Scout Instruct&quot;


## Implemented Interfaces

* Serializable


