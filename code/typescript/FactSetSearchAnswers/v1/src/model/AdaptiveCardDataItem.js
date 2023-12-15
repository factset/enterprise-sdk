/**
 * FactSet Search Answers API
 * The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: FactSearch.Team@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import AdaptiveCardWithThumbnail from './AdaptiveCardWithThumbnail';

/**
 * The AdaptiveCardDataItem model module.
 * @module model/AdaptiveCardDataItem
 */
class AdaptiveCardDataItem {
    /**
     * Constructs a new <code>AdaptiveCardDataItem</code>.
     * @alias module:model/AdaptiveCardDataItem
     * @implements module:model/AdaptiveCardWithThumbnail
     */
    constructor() { 
        AdaptiveCardWithThumbnail.initialize(this);
        AdaptiveCardDataItem.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>AdaptiveCardDataItem</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AdaptiveCardDataItem} obj Optional instance to populate.
     * @return {module:model/AdaptiveCardDataItem} The populated <code>AdaptiveCardDataItem</code> instance.
     */
    static constructFromObject(data, obj) {
        // openApiType:object format:
        if (data) {
            obj = obj || new AdaptiveCardDataItem();
            AdaptiveCardWithThumbnail.constructFromObject(data, obj);

            if (data.hasOwnProperty('adaptiveCard')) {
                obj['adaptiveCard'] = ApiClient.convertToType(data['adaptiveCard'], Object);
            }
            if (data.hasOwnProperty('thumbnail')) {
                obj['thumbnail'] = ApiClient.convertToType(data['thumbnail'], Object);
            }
        }
        return obj;
    }


}

/**
 * JSON that matches [Adaptive Card](https://adaptivecards.io/explorer/) format.
 * @member {Object} adaptiveCard
 */
AdaptiveCardDataItem.prototype['adaptiveCard'] = undefined;

/**
 * JSON that matches [Thumbnail Card](https://docs.microsoft.com/en-us/microsoftteams/platform/task-modules-and-cards/cards/cards-reference#thumbnail-card) format.
 * @member {Object} thumbnail
 */
AdaptiveCardDataItem.prototype['thumbnail'] = undefined;


// Implement AdaptiveCardWithThumbnail interface:
/**
 * JSON that matches [Adaptive Card](https://adaptivecards.io/explorer/) format.
 * @member {Object} adaptiveCard
 */
AdaptiveCardWithThumbnail.prototype['adaptiveCard'] = undefined;
/**
 * JSON that matches [Thumbnail Card](https://docs.microsoft.com/en-us/microsoftteams/platform/task-modules-and-cards/cards/cards-reference#thumbnail-card) format.
 * @member {Object} thumbnail
 */
AdaptiveCardWithThumbnail.prototype['thumbnail'] = undefined;




export default AdaptiveCardDataItem;

