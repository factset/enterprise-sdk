/**
 * Cabot Models API
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import BuyContextModelAnalyticsItem from './BuyContextModelAnalyticsItem';

/**
 * The BuyContextModelAnalyticsContextAttribute model module.
 * @module model/BuyContextModelAnalyticsContextAttribute
 */
class BuyContextModelAnalyticsContextAttribute {
    /**
     * Constructs a new <code>BuyContextModelAnalyticsContextAttribute</code>.
     * Context analysis graphically depicts a manager’s actual decisions both to describe how decisions are made and how they ultimately impact results. This model enables a manager to explore the consistency of his/her buy process in addition to the effectiveness of new buys with regard to fundamental attributes (e.g., EPS, ROI, debt to asset, etc.) as well as client provided proprietary attributes.
     * @alias module:model/BuyContextModelAnalyticsContextAttribute
     */
    constructor() { 
        
        BuyContextModelAnalyticsContextAttribute.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BuyContextModelAnalyticsContextAttribute</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BuyContextModelAnalyticsContextAttribute} obj Optional instance to populate.
     * @return {module:model/BuyContextModelAnalyticsContextAttribute} The populated <code>BuyContextModelAnalyticsContextAttribute</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BuyContextModelAnalyticsContextAttribute();

            if (data.hasOwnProperty('values')) {
                obj['values'] = BuyContextModelAnalyticsItem.constructFromObject(data['values']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/BuyContextModelAnalyticsItem} values
 */
BuyContextModelAnalyticsContextAttribute.prototype['values'] = undefined;






export default BuyContextModelAnalyticsContextAttribute;

