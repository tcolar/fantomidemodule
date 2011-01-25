/**
 * Annotation for custom settings tab
 */

@OptionsPanelController.ContainerRegistration
(
    id=FanGlobalSettingsController.ID,
    categoryName=FanGlobalSettingsController.ID,
    iconBase="net/colar/netbeans/fan/fantom_options.png",
    position=799
)
package net.colar.netbeans.fan;

import org.netbeans.spi.options.OptionsPanelController;
import net.colar.netbeans.fan.wizard.FanGlobalSettingsController;
