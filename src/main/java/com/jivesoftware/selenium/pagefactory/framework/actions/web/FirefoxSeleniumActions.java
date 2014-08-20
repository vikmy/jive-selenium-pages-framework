package com.jivesoftware.selenium.pagefactory.framework.actions.web;

import com.jivesoftware.selenium.pagefactory.framework.actions.BaseSeleniumActions;
import com.jivesoftware.selenium.pagefactory.framework.browser.Browser;

/**
 * Selenium Actions for Firefox Browser.
 *
 * Currently, this is the same as BaseSeleniumActions, as we don't have any need to implement anything differently
 * for Firefox.
 */
public class FirefoxSeleniumActions extends BaseSeleniumActions {
    public FirefoxSeleniumActions(Browser browser) {
        super(browser);
    }
}