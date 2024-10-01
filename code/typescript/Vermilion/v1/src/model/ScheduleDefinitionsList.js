/**
 * VRS API documentation
 * Documentation on all available end points in the VRSAPI
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import DataSourceListMeta from './DataSourceListMeta';
import ScheduleDefinition from './ScheduleDefinition';

/**
 * The ScheduleDefinitionsList model module.
 * @module model/ScheduleDefinitionsList
 */
class ScheduleDefinitionsList {
    /**
     * Constructs a new <code>ScheduleDefinitionsList</code>.
     * @alias module:model/ScheduleDefinitionsList
     */
    constructor() { 
        
        ScheduleDefinitionsList.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ScheduleDefinitionsList</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ScheduleDefinitionsList} obj Optional instance to populate.
     * @return {module:model/ScheduleDefinitionsList} The populated <code>ScheduleDefinitionsList</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ScheduleDefinitionsList();

            if (data.hasOwnProperty('meta')) {
                obj['meta'] = DataSourceListMeta.constructFromObject(data['meta']);
            }
            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [ScheduleDefinition]);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/DataSourceListMeta} meta
 */
ScheduleDefinitionsList.prototype['meta'] = undefined;

/**
 * @member {Array.<module:model/ScheduleDefinition>} data
 */
ScheduleDefinitionsList.prototype['data'] = undefined;






export default ScheduleDefinitionsList;

