/**
 * FactSet Global Prices API
 * The FactSet Global Prices API provides end of day market pricing content using cloud and microservices technology, encompassing both pricing as well as corporate actions and events data.</p> 
 *
 * The version of the OpenAPI document: 1.8.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import SoErrorObjectLinks from './SoErrorObjectLinks';

/**
 * The SoErrorObject model module.
 * @module model/SoErrorObject
 */
class SoErrorObject {
    /**
     * Constructs a new <code>SoErrorObject</code>.
     * @alias module:model/SoErrorObject
     */
    constructor() { 
        
        SoErrorObject.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SoErrorObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SoErrorObject} obj Optional instance to populate.
     * @return {module:model/SoErrorObject} The populated <code>SoErrorObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SoErrorObject();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
            if (data.hasOwnProperty('links')) {
                obj['links'] = SoErrorObjectLinks.constructFromObject(data['links']);
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
        }
        return obj;
    }


}

/**
 * A UUID for this particular occurrence of the problem.
 * @member {String} id
 */
SoErrorObject.prototype['id'] = undefined;

/**
 * status
 * @member {String} code
 */
SoErrorObject.prototype['code'] = undefined;

/**
 * @member {module:model/SoErrorObjectLinks} links
 */
SoErrorObject.prototype['links'] = undefined;

/**
 * The plain text error message
 * @member {String} title
 */
SoErrorObject.prototype['title'] = undefined;






export default SoErrorObject;

