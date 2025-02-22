/**
 * FactSet RIBCS
 * FactSet Revere Business Industry Classification System (RBICS) is a comprehensive structured taxonomy to classify companies by what they primarily do. It delivers a granular view for investors by classifying companies using a bottom-up approach according to the products and services they provide. By combining this approach with a top-level grouping based on companies' behavior similarities and stock co-movement, FactSet RBICS delivers unprecedented precision for 1,400+ sector groups.  RBICS Focus is a six level classification which highlights the companys main business. It is based on the company business line/s that stand for majority of a the revenue that the company generates. Updated monthly. For more details, visit [Online Assitant Page #20710](https://oa.apps.factset.com/pages/20710).<p><b>Rate limit is set to 40 requests per second</b>.</p> 
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The Structure model module.
 * @module model/Structure
 */
class Structure {
    /**
     * Constructs a new <code>Structure</code>.
     * @alias module:model/Structure
     * @extends Object
     */
    constructor() { 
        
        Structure.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Structure</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Structure} obj Optional instance to populate.
     * @return {module:model/Structure} The populated <code>Structure</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Structure();

            ApiClient.constructFromObject(data, obj, 'Object');
            

            if (data.hasOwnProperty('rbicsId')) {
                obj['rbicsId'] = ApiClient.convertToType(data['rbicsId'], 'String');
            }
            if (data.hasOwnProperty('firstDate')) {
                obj['firstDate'] = ApiClient.convertToType(data['firstDate'], 'String');
            }
            if (data.hasOwnProperty('lastDate')) {
                obj['lastDate'] = ApiClient.convertToType(data['lastDate'], 'String');
            }
        }
        return obj;
    }


}

/**
 * RBICS Code for the classification.
 * @member {String} rbicsId
 */
Structure.prototype['rbicsId'] = undefined;

/**
 * First date of the classification.
 * @member {String} firstDate
 */
Structure.prototype['firstDate'] = undefined;

/**
 * Date when the classification became no longer valid. If `null`, the classification is still valid.
 * @member {String} lastDate
 */
Structure.prototype['lastDate'] = undefined;






export default Structure;

