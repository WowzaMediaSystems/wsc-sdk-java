
# Schedule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionType** | [**ActionTypeEnum**](#ActionTypeEnum) | The type of action that the schedule should trigger on the transcoder. The default is **start**. |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the schedule was created. |  [optional]
**endRepeat** | [**LocalDate**](LocalDate.md) | The month, day, and year that a recurring schedule should stop running. Specify **YYYY-MM-DD**. |  [optional]
**id** | **String** | The unique alphanumeric string that identifies the schedule. |  [optional]
**name** | **String** | A descriptive name for the schedule. Maximum 255 characters. |  [optional]
**recurrenceData** | [**RecurrenceDataEnum**](#RecurrenceDataEnum) | The day or days of the week that a recurring schedule should run. |  [optional]
**recurrenceType** | [**RecurrenceTypeEnum**](#RecurrenceTypeEnum) | A schedule can run one time only (**once**) or repeat (**recur**) until a specified *end_repeat* date. The default is **once**. |  [optional]
**startRepeat** | [**LocalDate**](LocalDate.md) | The month, day, and year that the recurring schedule should go into effect. Specify **YYYY-MM-DD**. |  [optional]
**startTranscoder** | [**OffsetDateTime**](OffsetDateTime.md) | The month, day, year, and time of day that the *action_type* **start** should occur. Specify **YYYY-MM-DD HH:MM:SS** where **HH** is a 24-hour clock in UTC. |  [optional]
**state** | [**StateEnum**](#StateEnum) | A schedule must be **enabled** to run. Specify **enabled** to run the schedule or **disabled** to turn off the schedule so that it doesn&#39;t run. |  [optional]
**stopTranscoder** | [**OffsetDateTime**](OffsetDateTime.md) | The month, day, year, and time of day that the *action_type* **stop** should occur. Specify **YYYY-MM-DD HH:MM:SS** where **HH** is a 24-hour clock in UTC. |  [optional]
**transcoderId** | **String** | The unique alphanumeric string that identifies the transcoder being scheduled. |  [optional]
**transcoderName** | **String** | The name of the transcoder being scheduled. |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time that the schedule was updated. |  [optional]


<a name="ActionTypeEnum"></a>
## Enum: ActionTypeEnum
Name | Value
---- | -----
START | &quot;start&quot;
STOP | &quot;stop&quot;
START_STOP | &quot;start_stop&quot;


<a name="RecurrenceDataEnum"></a>
## Enum: RecurrenceDataEnum
Name | Value
---- | -----
SUNDAY | &quot;sunday&quot;
MONDAY | &quot;monday&quot;
TUESDAY | &quot;tuesday&quot;
WEDNESDAY | &quot;wednesday&quot;
THURSDAY | &quot;thursday&quot;
FRIDAY | &quot;friday&quot;
SATURDAY | &quot;saturday&quot;


<a name="RecurrenceTypeEnum"></a>
## Enum: RecurrenceTypeEnum
Name | Value
---- | -----
ONCE | &quot;once&quot;
RECUR | &quot;recur&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ENABLED | &quot;enabled&quot;
DISABLED | &quot;disabled&quot;
EXPIRED | &quot;expired&quot;



