

# CompanyStats

List of the statistics such as the average age, tenure, compensation of leadership, the number of executives, and the gender diversity of leadership for the requested identifier.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**averageMgmtCompensation** | **BigDecimal** | Average compensation for the executives |  [optional]
**averageTenure** | **Double** | Avergae tenure of the people |  [optional]
**medianTenure** | **Double** | Median tenure |  [optional]
**averageAge** | **Double** | Average of the executives on the management and board |  [optional]
**maxAge** | **BigDecimal** | Maximum age of the people on Management &amp; Board |  [optional]
**minimumAge** | **BigDecimal** | Minimum age of the person on board |  [optional]
**medianAge** | **BigDecimal** | Median age of the people on board |  [optional]
**boardIndependentDirectors** | **BigDecimal** | Independent directors on the board |  [optional]
**femaleBoardMembers** | **BigDecimal** | Number of female members on the board |  [optional]
**femaleBoardMembersPercent** | **Double** | Percentage of female members on the board |  [optional]
**numberOfMembers** | **BigDecimal** | Number of people on board. |  [optional]
**onOtherBoardsAll** | **BigDecimal** | On Other Boards All |  [optional]
**onOtherBoardsCorporate** | **BigDecimal** | On Other Boards Corporate |  [optional]
**mbType** | **String** | Management and Board type, where MB &#x3D; Management &amp; Board, MGMT &#x3D; Management, and BRD &#x3D; Board. This is a pass-through value from the input used in the &#x60;mbType&#x60; query parameter. |  [optional]
**requestId** | **String** | Original identifier used for the request. |  [optional]


## Implemented Interfaces

* Serializable


