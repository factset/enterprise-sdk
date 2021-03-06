/**
 * Recommendation List API For Digital Portals
 * A recommendation list is revision-controlled, with up to 5,000 revisions per recommendation list.  A recommendation list as of a given revision may optionally point to an instrument (e.g. an index) and contains a list of up to 1,000 elements, each referring to a security traded on a market (e.g. a financial product recommended by the bank). For listings that are not available in the Wealth Management platform, no information beyond a customer-defined name is available. Each element may optionally have a portfolio weight. Identifiers for revisions are globally unique.  See the Quotes API for Digital Portals for access to detailed price information.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The RecommendationListRevisionListDataActiveRange model module.
 * @module model/RecommendationListRevisionListDataActiveRange
 */
class RecommendationListRevisionListDataActiveRange {
    /**
     * Constructs a new <code>RecommendationListRevisionListDataActiveRange</code>.
     * Restrict the result list to revisions which have been active during the specified time range.
     * @alias module:model/RecommendationListRevisionListDataActiveRange
     * @param start {String} The starting point of the time range (inclusive), or `null` to indicate that the time range extends indefinitely into the past.
     * @param end {String} The ending point of the time range (exclusive), or `null` to indicate that the time range extends indefinitely into the future.
     */
    constructor(start, end) { 
        
        RecommendationListRevisionListDataActiveRange.initialize(this, start, end);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, start, end) { 
        obj['start'] = start;
        obj['end'] = end;
    }

    /**
     * Constructs a <code>RecommendationListRevisionListDataActiveRange</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RecommendationListRevisionListDataActiveRange} obj Optional instance to populate.
     * @return {module:model/RecommendationListRevisionListDataActiveRange} The populated <code>RecommendationListRevisionListDataActiveRange</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RecommendationListRevisionListDataActiveRange();

            if (data.hasOwnProperty('start')) {
                obj['start'] = ApiClient.convertToType(data['start'], 'String');
            }
            if (data.hasOwnProperty('end')) {
                obj['end'] = ApiClient.convertToType(data['end'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The starting point of the time range (inclusive), or `null` to indicate that the time range extends indefinitely into the past.
 * @member {String} start
 */
RecommendationListRevisionListDataActiveRange.prototype['start'] = undefined;

/**
 * The ending point of the time range (exclusive), or `null` to indicate that the time range extends indefinitely into the future.
 * @member {String} end
 */
RecommendationListRevisionListDataActiveRange.prototype['end'] = undefined;






export default RecommendationListRevisionListDataActiveRange;

